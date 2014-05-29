#
#	Sets parameters for CAN BUS via the sysfs interface (rather than 
# 	using the interfaces file where these parameters are not parsed).
#

DESCRIPTION = "CAN BUS parameters via sysfs"
SECTION = "bsp"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

PR = "r0"

inherit update-rc.d

INITSCRIPT_NAME = "can-bus"
INITSCRIPT_PARAMS = "start 45 S . stop 45 0 6 1 ."

SRC_URI = "file://init"

do_install () {
	install -m 0755 ${WORKDIR}/init ${D}${sysconfdir}/init.d/can-bus
}

RDEPENDS_${PN} = "init-ifupdown"
