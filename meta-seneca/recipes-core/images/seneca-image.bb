SUMMARY = "This is a base image created as an example for courses."
inherit core-image

IMAGE_LINGUAS = " "

LICENSE = "MIT"

IMAGE_INSTALL:append = " \
	usbutils \
	usbinit \
	i2c-tools \
	libgpiod \
	simple-library \
	weston \
	matchbox-keyboard \
	cairo  \
	libgbm \
	libdrm \
	wayland \
	mesa \
	sensor-dash \
	pmu-mod \
	"

IMAGE_FEATURES:append = " \
	ssh-server-openssh \
	splash \
	tools-debug \
	tools-sdk \
	"

IMAGE_BOOT_FILES = "${SPL_BINARYNAME} u-boot.${UBOOT_SUFFIX} tiboot3.bin k3-am625-beagleplay.dtb"

DISTRO_FEATURES:append = " usbgadget wayland opengl pam x11"
MACHINE_FEATURES:append = " usbgadget usbhost"

CORE_IMAGE_BASE_INSTALL += "gtk+3-demo"
CORE_IMAGE_BASE_INSTALL += "${@bb.utils.contains('DISTRO_FEATURES', 'x11', 'weston-xwayland matchbox-terminal', '', d)}"
