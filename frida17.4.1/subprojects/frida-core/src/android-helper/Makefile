ANDROID_API_LEVEL ?= 19
ANDROID_SDK_ROOT ?= $(shell echo ~/Android/Sdk)
D8 ?= $(shell ls "$(ANDROID_SDK_ROOT)"/build-tools/*/d8 2>/dev/null | sort | tail -n 1)

android_platform := android-$(ANDROID_API_LEVEL)
android_jar := $(ANDROID_SDK_ROOT)/platforms/$(android_platform)/android.jar

helper.dex: build/frida-helper.jar
	$(D8) \
		--classpath $(android_jar) \
		--output build/ \
		$<
	mv build/classes.dex $@

build/frida-helper.jar: re/frida/Helper.java re/frida/HelperBackend.java
	javac \
		--release 8 \
		-cp .:$(android_jar) \
		-Xlint:deprecation \
		-Xlint:unchecked \
		$^ \
		-d build/java/
	jar cfe $@ re.sunday.Helper -C build/java/ .
