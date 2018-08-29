cmake_minimum_required(VERSION 3.4.1)

add_library( native-lib
             SHARED
             src/main/cpp/native-lib.cpp )


find_library( log-lib
              log )

# 声明一个DIR的变量获取libs的路径
set(DIR ../../../../libs)

# 引入头文件
include_directories(libs/include)

# 引入所有的so动态库
add_library(avcodec-56
            SHARED
            IMPORTED)
set_target_properties(avcodec-56
                      PROPERTIES IMPORTED_LOCATION
                      ${DIR}/armeabi-v7a/libavcodec-56.so)

add_library(avdevice-56
            SHARED
            IMPORTED)
set_target_properties(avdevice-56
                      PROPERTIES IMPORTED_LOCATION
                      ${DIR}/armeabi-v7a/libavdevice-56.so)

add_library(avformat-56
            SHARED
            IMPORTED)
set_target_properties(avformat-56
                      PROPERTIES IMPORTED_LOCATION
                      ${DIR}/armeabi-v7a/libavformat-56.so)

add_library(avutil-54
            SHARED
            IMPORTED)
set_target_properties(avutil-54
                      PROPERTIES IMPORTED_LOCATION
                      ${DIR}/armeabi-v7a/libavutil-54.so)

add_library(postproc-53
            SHARED
            IMPORTED)
set_target_properties(postproc-53
                      PROPERTIES IMPORTED_LOCATION
                      ${DIR}/armeabi-v7a/libpostproc-53.so)


add_library(swresample-1
             SHARED
             IMPORTED)
set_target_properties(swresample-1
                       PROPERTIES IMPORTED_LOCATION
                       ${DIR}/armeabi-v7a/libswresample-1.so)

add_library(swscale-3
              SHARED
              IMPORTED)
set_target_properties(swscale-3
                        PROPERTIES IMPORTED_LOCATION
                        ${DIR}/armeabi-v7a/libswscale-3.so)


add_library(avfilter-5
              SHARED
              IMPORTED)
set_target_properties(avfilter-5
                        PROPERTIES IMPORTED_LOCATION
                        ${DIR}/armeabi-v7a/libavfilter-5.so)


# 链接动态库

target_link_libraries( native-lib
                      avcodec-56
                      avdevice-56
                      avformat-56
                      avutil-54
                      postproc-53
                      swresample-1
                      swscale-3
                      avfilter-5
                      ${log-lib} )