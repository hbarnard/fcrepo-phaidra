#!/bin/bash

#--------------------------------------------------
# Load environment-specific settings for all tests
#--------------------------------------------------

SCRIPTPATH=$(cd ${0%/*} && echo $PWD/${0##*/})
SCRIPTDIR=`dirname "$SCRIPTPATH"`
. $SCRIPTDIR/env.sh

CATALINA_HOME=$FEDORA_HOME/tomcat

#-------------------------------------------
# Echo global settings and export as needed
#-------------------------------------------

echo "[Global Settings]"
echo "JAVA_OPTS     = $JAVA_OPTS"
echo "MAVEN_OPTS    = $MAVEN_OPTS"
echo "BUILD_HOME    = $BUILD_HOME"
echo "FEDORA_HOME   = $FEDORA_HOME"
echo "CATALINA_HOME = $CATALINA_HOME"
echo ""

export FEDORA_HOME
export CATALINA_HOME

#-------------------------------------------------
# Echo common script options and export as needed
#-------------------------------------------------

echo "[Script Options]"
echo "Arguments     = $*"

# First arg should always specify java6
if [ $# -lt 1 ]; then
  echo "ERROR: Expected first argument: java6"
  exit 1
else
  if [ "$1" == "java6" ]; then
    JAVA_HOME=$JAVA6_HOME
  else
    echo "ERROR: First argument must be java6"
    exit 1
  fi
fi

export JAVA_HOME

echo "JAVA_HOME     = $JAVA_HOME"
