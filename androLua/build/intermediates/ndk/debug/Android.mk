LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)

LOCAL_MODULE := androLua
LOCAL_LDFLAGS := -Wl,--build-id
LOCAL_SRC_FILES := \
	D:\Development\WorkSpace\AndroidStudioProjects\ComicDoor\androLua\src\main\jni\Android.mk \
	D:\Development\WorkSpace\AndroidStudioProjects\ComicDoor\androLua\src\main\jni\Application.mk \
	D:\Development\WorkSpace\AndroidStudioProjects\ComicDoor\androLua\src\main\jni\lua\Android.mk \
	D:\Development\WorkSpace\AndroidStudioProjects\ComicDoor\androLua\src\main\jni\lua\lapi.c \
	D:\Development\WorkSpace\AndroidStudioProjects\ComicDoor\androLua\src\main\jni\lua\lauxlib.c \
	D:\Development\WorkSpace\AndroidStudioProjects\ComicDoor\androLua\src\main\jni\lua\lbaselib.c \
	D:\Development\WorkSpace\AndroidStudioProjects\ComicDoor\androLua\src\main\jni\lua\lcode.c \
	D:\Development\WorkSpace\AndroidStudioProjects\ComicDoor\androLua\src\main\jni\lua\ldblib.c \
	D:\Development\WorkSpace\AndroidStudioProjects\ComicDoor\androLua\src\main\jni\lua\ldebug.c \
	D:\Development\WorkSpace\AndroidStudioProjects\ComicDoor\androLua\src\main\jni\lua\ldo.c \
	D:\Development\WorkSpace\AndroidStudioProjects\ComicDoor\androLua\src\main\jni\lua\ldump.c \
	D:\Development\WorkSpace\AndroidStudioProjects\ComicDoor\androLua\src\main\jni\lua\lfunc.c \
	D:\Development\WorkSpace\AndroidStudioProjects\ComicDoor\androLua\src\main\jni\lua\lgc.c \
	D:\Development\WorkSpace\AndroidStudioProjects\ComicDoor\androLua\src\main\jni\lua\linit.c \
	D:\Development\WorkSpace\AndroidStudioProjects\ComicDoor\androLua\src\main\jni\lua\liolib.c \
	D:\Development\WorkSpace\AndroidStudioProjects\ComicDoor\androLua\src\main\jni\lua\llex.c \
	D:\Development\WorkSpace\AndroidStudioProjects\ComicDoor\androLua\src\main\jni\lua\lmathlib.c \
	D:\Development\WorkSpace\AndroidStudioProjects\ComicDoor\androLua\src\main\jni\lua\lmem.c \
	D:\Development\WorkSpace\AndroidStudioProjects\ComicDoor\androLua\src\main\jni\lua\loadlib.c \
	D:\Development\WorkSpace\AndroidStudioProjects\ComicDoor\androLua\src\main\jni\lua\lobject.c \
	D:\Development\WorkSpace\AndroidStudioProjects\ComicDoor\androLua\src\main\jni\lua\lopcodes.c \
	D:\Development\WorkSpace\AndroidStudioProjects\ComicDoor\androLua\src\main\jni\lua\loslib.c \
	D:\Development\WorkSpace\AndroidStudioProjects\ComicDoor\androLua\src\main\jni\lua\lparser.c \
	D:\Development\WorkSpace\AndroidStudioProjects\ComicDoor\androLua\src\main\jni\lua\lstate.c \
	D:\Development\WorkSpace\AndroidStudioProjects\ComicDoor\androLua\src\main\jni\lua\lstring.c \
	D:\Development\WorkSpace\AndroidStudioProjects\ComicDoor\androLua\src\main\jni\lua\lstrlib.c \
	D:\Development\WorkSpace\AndroidStudioProjects\ComicDoor\androLua\src\main\jni\lua\ltable.c \
	D:\Development\WorkSpace\AndroidStudioProjects\ComicDoor\androLua\src\main\jni\lua\ltablib.c \
	D:\Development\WorkSpace\AndroidStudioProjects\ComicDoor\androLua\src\main\jni\lua\ltm.c \
	D:\Development\WorkSpace\AndroidStudioProjects\ComicDoor\androLua\src\main\jni\lua\lundump.c \
	D:\Development\WorkSpace\AndroidStudioProjects\ComicDoor\androLua\src\main\jni\lua\lvm.c \
	D:\Development\WorkSpace\AndroidStudioProjects\ComicDoor\androLua\src\main\jni\lua\lzio.c \
	D:\Development\WorkSpace\AndroidStudioProjects\ComicDoor\androLua\src\main\jni\org.keplerproject.luajava\Android.mk \
	D:\Development\WorkSpace\AndroidStudioProjects\ComicDoor\androLua\src\main\jni\org.keplerproject.luajava\org.keplerproject.luajava.c \

LOCAL_C_INCLUDES += D:\Development\WorkSpace\AndroidStudioProjects\ComicDoor\androLua\src\main\jni
LOCAL_C_INCLUDES += D:\Development\WorkSpace\AndroidStudioProjects\ComicDoor\androLua\src\debug\jni

include $(BUILD_SHARED_LIBRARY)
