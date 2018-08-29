#!/bin/bash


MD_INSTALL="$(pwd -W)/build/install"
echo $MD_INSTALL
echo $MD_HOME

if [ "$OS" = Windows_NT ]; then
    md_home_url_leader=$(echo "$MD_INSTALL" | sed -e 's/^/\//' -e 's/ /%20/g' -e 's/\\/\//g')
    md_home_url_base=$(echo "$MD_INSTALL" | sed -e 's/:/%3A/g' -e 's/ /%20/g' \
                                                    -e 's/\//%2F/g' -e 's/\\/%5C/g')
    cp_delim=";"
else
    md_home_url_leader=$(echo "$MD_INSTALL" | sed -e 's/ /%20/g')
    md_home_url_base=$(echo "$MD_INSTALL" | sed -e 's/ /%20/g')
    cp_delim=":"
fi

md_cp_url=file:$md_home_url_leader/bin/magicdraw.properties?base=$md_home_url_base#CLASSPATH

OSGI_LAUNCHER=$(echo "$MD_INSTALL"/lib/com.nomagic.osgi.launcher-*.jar)
OSGI_FRAMEWORK=$(echo "$MD_INSTALL"/lib/bundles/org.eclipse.osgi_*.jar)
MD_OSGI_FRAGMENT=$(echo "$MD_INSTALL"/lib/bundles/com.nomagic.magicdraw.osgi.fragment_*.jar)

CP="${OSGI_LAUNCHER}${cp_delim}${OSGI_FRAMEWORK}${cp_delim}${MD_OSGI_FRAGMENT}${cp_delim}\
`  `$MD_INSTALL/lib/md_api.jar${cp_delim}$MD_INSTALL/lib/md_common_api.jar${cp_delim}\
`  `$MD_INSTALL/lib/md.jar${cp_delim}$MD_INSTALL/lib/md_common.jar${cp_delim}\
`  `$MD_INSTALL/lib/jna.jar"

java -Xmx8192M -Xss1024K \
     -Dmd.class.path=$md_cp_url \
     -Dcom.nomagic.osgi.config.dir="$MD_INSTALL/configuration" \
     -Desi.system.config="$MD_INSTALL/data/application.conf" \
     -Dlogback.configurationFile="$MD_INSTALL/data/logback.xml" \
     -Dcom.nomagic.magicdraw.launcher=com.nomagic.magicdraw.commandline.CommandLineActionLauncher \
     -Dcom.nomagic.magicdraw.commandline.action=com.incquerylabs.magicdraw.plugin.headless.example.ExampleHeadlessAction \
     -cp "$CP" \
     com.nomagic.osgi.launcher.ProductionFrameworkLauncher "$@"