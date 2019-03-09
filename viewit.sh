#!/usr/bin/env bash

set -e

test -z "$1" && echo "You should pass number of example" && exit 1
__example_no="$1"
__dir="$(dirname $0)"
"$__dir"/gradlew -q clean compileKotlin compileJava > /dev/null
(
    cd "$__dir"/build/classes/kotlin/main/usualstructs/step"$__example_no"
    fernflower -log=ERROR -gds=1 -ind='  ' . . > /dev/null
    vim *Kt.java *Kt*.java *.java
)
