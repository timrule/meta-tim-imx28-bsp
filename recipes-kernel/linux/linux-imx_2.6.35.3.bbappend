FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

SRC_URI += "file://defconfig \
            file://0001-calibrate-hello-yocto.patch \
            file://0001-first-pass-on-sht21-support.patch \
            file://0001-enable-sht21-on-i2c-bus-0.patch \
"

PRINC := "${@int(PRINC) + 1}"

