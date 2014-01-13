#!/bin/bash
cd "$(dirname "$0")"
java -Xmx3G -Xms2G -jar craftbukkit.jar -o true
