cmake_minimum_required(VERSION 3.22.1)

project(demo_scan LANGUAGES CXX)

add_library(demo_scan SHARED scanner.cpp)

find_library(log-lib log)

target_compile_features(demo_scan PRIVATE cxx_std_20)
target_link_libraries(demo_scan PRIVATE ${log-lib})
