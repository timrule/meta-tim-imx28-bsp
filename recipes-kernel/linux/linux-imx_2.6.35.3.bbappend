FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

SRC_URI += "file://defconfig \
            file://0001-patch-back-sht21-support.patch \
            file://0002-enable-sht21-on-i2c-bus-0.patch \
            file://0001-Sensirion-Stick-1.0-USB-to-I2C-driver.patch \
"

PRINC := "${@int(PRINC) + 1}"

