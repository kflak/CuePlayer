
+ String {

  asCueFunction {
    ^this.standardizePath.load;
  }

}

+ Function {

  asCueFunction {
    ^this;
  }

  largeDisplayInfo {
	^""
  }

  cueTitle {
	^""
  }

}

+ CueInfo {

  asCueFunction {
    ^this;
  }

}

+ Object {

  asCueFunction {
    "------------------------------------------------------------".postln;
    (this.class.asString + "does not respond to asCueFunction").warn;
    "Use one of the following objects:".postln;
    "    Function".postln;
    "    Cue".postln;
    "    String (path to scd file that returns a Function as above)".postln;
    "------------------------------------------------------------".postln;
  }

}

+ Nil {

  asCueFunction {
    ^nil;
  }

  largeDisplayInfo {
	^""
  }

  cueTitle {
	^""
  }

}