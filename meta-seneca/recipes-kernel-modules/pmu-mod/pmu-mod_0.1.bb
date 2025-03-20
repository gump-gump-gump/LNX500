SUMMARY = "Example of how to build an external Linux kernel module"
DESCRIPTION = "${SUMMARY}"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

inherit module

SRC_URI = "git://github.com/gump-gump-gump/pmu-mod;branch=main;protocol=https"
SRCREV = "1433a8cfe3733d81907bc4cde7c664f781abab5b"

S = "${WORKDIR}"

RPROVIDES:${PN} += "pmu-mod"
