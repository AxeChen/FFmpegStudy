
#ifndef FFMPEGMUSIC_LOG_H
#define FFMPEGMUSIC_LOG_H
#include <android/log.h>

#define LOGE(FORMAT,...) __android_log_print(ANDROID_LOG_ERROR,"czf",FORMAT,##__VA_ARGS__);

#endif //FFMPEGMUSIC_LOG_H
