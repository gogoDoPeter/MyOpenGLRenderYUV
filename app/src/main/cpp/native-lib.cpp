#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_com_peter_myopenglrenderyuv_MainActivity_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}

extern "C"
JNIEXPORT void JNICALL
Java_com_peter_myopenglrenderyuv_opengl_NativeOpenGl_surfaceCreate(JNIEnv *env, jobject thiz, jobject surface) {
    // TODO: implement surfaceCreate()
}

extern "C"
JNIEXPORT void JNICALL
Java_com_peter_myopenglrenderyuv_opengl_NativeOpenGl_surfaceChange(JNIEnv *env, jobject thiz,
                                                                   jint width, jint height) {
    // TODO: implement surfaceChange()
}

extern "C"
JNIEXPORT void JNICALL
Java_com_peter_myopenglrenderyuv_opengl_NativeOpenGl_surfaceDestory(JNIEnv *env, jobject thiz) {
    // TODO: implement surfaceDestory()
}