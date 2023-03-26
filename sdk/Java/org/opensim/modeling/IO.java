/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 * A class for performing input and output with OpenSim API.<br>
 * <br>
 * @version 1.0<br>
 * @author Frank C. Anderson
 */
public class IO {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public IO(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(IO obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimCommonJNI.delete_IO(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static String ConstructDateAndTimeStamp() {
    return opensimCommonJNI.IO_ConstructDateAndTimeStamp();
  }

  public static String FixSlashesInFilePath(String path) {
    return opensimCommonJNI.IO_FixSlashesInFilePath(path);
  }

  public static void SetScientific(boolean aTrueFalse) {
    opensimCommonJNI.IO_SetScientific(aTrueFalse);
  }

  public static boolean GetScientific() {
    return opensimCommonJNI.IO_GetScientific();
  }

  public static void SetGFormatForDoubleOutput(boolean aTrueFalse) {
    opensimCommonJNI.IO_SetGFormatForDoubleOutput(aTrueFalse);
  }

  public static boolean GetGFormatForDoubleOutput() {
    return opensimCommonJNI.IO_GetGFormatForDoubleOutput();
  }

  public static void SetDigitsPad(int aPad) {
    opensimCommonJNI.IO_SetDigitsPad(aPad);
  }

  public static int GetDigitsPad() {
    return opensimCommonJNI.IO_GetDigitsPad();
  }

  public static void SetPrecision(int aPlaces) {
    opensimCommonJNI.IO_SetPrecision(aPlaces);
  }

  public static int GetPrecision() {
    return opensimCommonJNI.IO_GetPrecision();
  }

  public static String GetDoubleOutputFormat() {
    return opensimCommonJNI.IO_GetDoubleOutputFormat();
  }

  public static void SetPrintOfflineDocuments(boolean aTrueFalse) {
    opensimCommonJNI.IO_SetPrintOfflineDocuments(aTrueFalse);
  }

  public static boolean GetPrintOfflineDocuments() {
    return opensimCommonJNI.IO_GetPrintOfflineDocuments();
  }

  public static int makeDir(String aDirName) {
    return opensimCommonJNI.IO_makeDir(aDirName);
  }

  public static int chDir(String aDirName) {
    return opensimCommonJNI.IO_chDir(aDirName);
  }

  public static String getCwd() {
    return opensimCommonJNI.IO_getCwd();
  }

  public static String getParentDirectory(String fileName) {
    return opensimCommonJNI.IO_getParentDirectory(fileName);
  }

  public static String GetFileNameFromURI(String aURI) {
    return opensimCommonJNI.IO_GetFileNameFromURI(aURI);
  }

  public static String formatText(String aComment, String leadingWhitespace, int width, String endlineTokenToInsert) {
    return opensimCommonJNI.IO_formatText__SWIG_0(aComment, leadingWhitespace, width, endlineTokenToInsert);
  }

  public static String formatText(String aComment, String leadingWhitespace, int width) {
    return opensimCommonJNI.IO_formatText__SWIG_1(aComment, leadingWhitespace, width);
  }

  public static String GetSuffix(String aStr, int aLen) {
    return opensimCommonJNI.IO_GetSuffix(aStr, aLen);
  }

  public static void RemoveSuffix(SWIGTYPE_p_std__string rStr, int aLen) {
    opensimCommonJNI.IO_RemoveSuffix(SWIGTYPE_p_std__string.getCPtr(rStr), aLen);
  }

  public static String replaceSubstring(String aStr, String aFrom, String aTo) {
    return opensimCommonJNI.IO_replaceSubstring(aStr, aFrom, aTo);
  }

  public static void TrimLeadingWhitespace(SWIGTYPE_p_std__string rStr) {
    opensimCommonJNI.IO_TrimLeadingWhitespace(SWIGTYPE_p_std__string.getCPtr(rStr));
  }

  public static void TrimTrailingWhitespace(SWIGTYPE_p_std__string rStr) {
    opensimCommonJNI.IO_TrimTrailingWhitespace(SWIGTYPE_p_std__string.getCPtr(rStr));
  }

  public static void TrimWhitespace(SWIGTYPE_p_std__string rStr) {
    opensimCommonJNI.IO_TrimWhitespace(SWIGTYPE_p_std__string.getCPtr(rStr));
  }

  public static String Lowercase(String aStr) {
    return opensimCommonJNI.IO_Lowercase(aStr);
  }

  public static String Uppercase(String aStr) {
    return opensimCommonJNI.IO_Uppercase(aStr);
  }

  /**
   *  Determine if `string` starts with the substring `start`.
   */
  public static boolean StartsWith(String string, String start) {
    return opensimCommonJNI.IO_StartsWith(string, start);
  }

  /**
   *  Determine if `string` ends with the substring `ending`.
   */
  public static boolean EndsWith(String string, String ending) {
    return opensimCommonJNI.IO_EndsWith(string, ending);
  }

  /**
   *  Same as StartsWith() except both arguments are first converted to<br>
   *  lowercase before performing the check.
   */
  public static boolean StartsWithIgnoringCase(String string, String start) {
    return opensimCommonJNI.IO_StartsWithIgnoringCase(string, start);
  }

  /**
   *  Same as EndsWith() except both arguments are first converted to<br>
   *  lowercase before performing the check.
   */
  public static boolean EndsWithIgnoringCase(String string, String ending) {
    return opensimCommonJNI.IO_EndsWithIgnoringCase(string, ending);
  }

  public static void eraseEmptyElements(StdVectorString list) {
    opensimCommonJNI.IO_eraseEmptyElements(StdVectorString.getCPtr(list), list);
  }

  public IO() {
    this(opensimCommonJNI.new_IO(), true);
  }

}