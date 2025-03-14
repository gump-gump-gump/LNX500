LICENSE = "CLOSED"

SRC_URI = "file://input_app.c"

S = "${WORKDIR}"

do_compile() {
    ${CC} ${CFLAGS} input_app.c -o input-app
}

do_install() {
    install -d ${D}${bindir}
    install input-app ${D}${bindir}
}
