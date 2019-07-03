#!/bin/bash
set -e -o pipefail

rm -f md_skeleton*.zip

for PLATFORM in macosx.cocoa linux.gtk win32.win32
do
	IFS='.' read -ra ELEMENTS <<< "$PLATFORM"
    PLATFORM_SHORT=${ELEMENTS[0]}
    TOOLKIT=${ELEMENTS[1]}
    rm -rf package

    mkdir package
    
    cp  com.incquerylabs.magicdraw.plugin.example/build/distributions/com.incquerylabs.magicdraw.plugin.example*.zip package
    cp  build/dependency-cache/com.incquerylabs.v4md*.zip package/com.incquerylabs.v4md.zip
    
    cd package

	VERSION=$(find . -name 'com.incquerylabs.magicdraw.plugin.example*.zip' | grep -Eo '[0-9]+\.[0-9]+\.[0-9]+')
    zip -rq ../md_skeleton-$PLATFORM_SHORT-$VERSION.zip *
    cd ..
done