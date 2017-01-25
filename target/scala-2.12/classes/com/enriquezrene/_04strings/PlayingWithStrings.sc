// value type is inferred
val string1 = "Hey"

// value type is provided
val string2: String = "Friend"

// multiline string
val string3 =
  """
    string
    with
    multiline
    support
  """

// nice string concatenation/interpolation
val interpolatedString = s"$string1 my $string2"