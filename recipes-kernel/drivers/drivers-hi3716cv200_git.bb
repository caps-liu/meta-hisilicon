DESCRIPTION = "drivers-rdk-hi3716cv200 module"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

inherit module

PV = "1.0+gitr${SRCPV}"

SRCREV="2fb5ac209eafb7f7e95ddc92b5b2aac35cbd1490"
SRC_URI = "git://github.com/caps-liu/hisi-driverlibs.git;protocol=https"
SRC_URI += "file://drvload"

S = "${WORKDIR}/git"

# Kernel module packages MUST begin with 'kernel-module-', otherwise
# multilib image generation can fail.
#
# The following line is only necessary if the recipe name does not begin
# with kernel-module-.
#
PKG_${PN} = "kernel-module-${PN}"

do_install_append() {
	install -d ${D}${sysconfdir}/init.d/
	install -m 0755 ${WORKDIR}/drvload ${D}${sysconfdir}/init.d/drvload
}

inherit update-rc.d

INITSCRIPT_NAME = "drvload"
INITSCRIPT_PARAMS = "start 50 5 2 ."

FILES_${PN} = "${sysconfdir}"
