LICENSE = "CLOSED"
DEPENDS = "nlohmann-json gtest spdlog"

SRC_URI = "git://github.com/ancor1369/simple-library.git;branch=main;protocol=https"
SRCREV = "1e2f9bf03244fa37187482dbfa95d676ae84df6c"

inherit cmake

S = "${WORKDIR}/git"

do_install() {
	install -d ${D}${bindir}
	install tests/simple-library-test ${D}${bindir}
}
