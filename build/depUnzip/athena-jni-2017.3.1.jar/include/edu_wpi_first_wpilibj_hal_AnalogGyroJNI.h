/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class edu_wpi_first_wpilibj_hal_AnalogGyroJNI */

#ifndef _Included_edu_wpi_first_wpilibj_hal_AnalogGyroJNI
#define _Included_edu_wpi_first_wpilibj_hal_AnalogGyroJNI
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     edu_wpi_first_wpilibj_hal_AnalogGyroJNI
 * Method:    initializeAnalogGyro
 * Signature: (I)I
 */
JNIEXPORT jint JNICALL Java_edu_wpi_first_wpilibj_hal_AnalogGyroJNI_initializeAnalogGyro
  (JNIEnv *, jclass, jint);

/*
 * Class:     edu_wpi_first_wpilibj_hal_AnalogGyroJNI
 * Method:    setupAnalogGyro
 * Signature: (I)V
 */
JNIEXPORT void JNICALL Java_edu_wpi_first_wpilibj_hal_AnalogGyroJNI_setupAnalogGyro
  (JNIEnv *, jclass, jint);

/*
 * Class:     edu_wpi_first_wpilibj_hal_AnalogGyroJNI
 * Method:    freeAnalogGyro
 * Signature: (I)V
 */
JNIEXPORT void JNICALL Java_edu_wpi_first_wpilibj_hal_AnalogGyroJNI_freeAnalogGyro
  (JNIEnv *, jclass, jint);

/*
 * Class:     edu_wpi_first_wpilibj_hal_AnalogGyroJNI
 * Method:    setAnalogGyroParameters
 * Signature: (IDDI)V
 */
JNIEXPORT void JNICALL Java_edu_wpi_first_wpilibj_hal_AnalogGyroJNI_setAnalogGyroParameters
  (JNIEnv *, jclass, jint, jdouble, jdouble, jint);

/*
 * Class:     edu_wpi_first_wpilibj_hal_AnalogGyroJNI
 * Method:    setAnalogGyroVoltsPerDegreePerSecond
 * Signature: (ID)V
 */
JNIEXPORT void JNICALL Java_edu_wpi_first_wpilibj_hal_AnalogGyroJNI_setAnalogGyroVoltsPerDegreePerSecond
  (JNIEnv *, jclass, jint, jdouble);

/*
 * Class:     edu_wpi_first_wpilibj_hal_AnalogGyroJNI
 * Method:    resetAnalogGyro
 * Signature: (I)V
 */
JNIEXPORT void JNICALL Java_edu_wpi_first_wpilibj_hal_AnalogGyroJNI_resetAnalogGyro
  (JNIEnv *, jclass, jint);

/*
 * Class:     edu_wpi_first_wpilibj_hal_AnalogGyroJNI
 * Method:    calibrateAnalogGyro
 * Signature: (I)V
 */
JNIEXPORT void JNICALL Java_edu_wpi_first_wpilibj_hal_AnalogGyroJNI_calibrateAnalogGyro
  (JNIEnv *, jclass, jint);

/*
 * Class:     edu_wpi_first_wpilibj_hal_AnalogGyroJNI
 * Method:    setAnalogGyroDeadband
 * Signature: (ID)V
 */
JNIEXPORT void JNICALL Java_edu_wpi_first_wpilibj_hal_AnalogGyroJNI_setAnalogGyroDeadband
  (JNIEnv *, jclass, jint, jdouble);

/*
 * Class:     edu_wpi_first_wpilibj_hal_AnalogGyroJNI
 * Method:    getAnalogGyroAngle
 * Signature: (I)D
 */
JNIEXPORT jdouble JNICALL Java_edu_wpi_first_wpilibj_hal_AnalogGyroJNI_getAnalogGyroAngle
  (JNIEnv *, jclass, jint);

/*
 * Class:     edu_wpi_first_wpilibj_hal_AnalogGyroJNI
 * Method:    getAnalogGyroRate
 * Signature: (I)D
 */
JNIEXPORT jdouble JNICALL Java_edu_wpi_first_wpilibj_hal_AnalogGyroJNI_getAnalogGyroRate
  (JNIEnv *, jclass, jint);

/*
 * Class:     edu_wpi_first_wpilibj_hal_AnalogGyroJNI
 * Method:    getAnalogGyroOffset
 * Signature: (I)D
 */
JNIEXPORT jdouble JNICALL Java_edu_wpi_first_wpilibj_hal_AnalogGyroJNI_getAnalogGyroOffset
  (JNIEnv *, jclass, jint);

/*
 * Class:     edu_wpi_first_wpilibj_hal_AnalogGyroJNI
 * Method:    getAnalogGyroCenter
 * Signature: (I)I
 */
JNIEXPORT jint JNICALL Java_edu_wpi_first_wpilibj_hal_AnalogGyroJNI_getAnalogGyroCenter
  (JNIEnv *, jclass, jint);

#ifdef __cplusplus
}
#endif
#endif
