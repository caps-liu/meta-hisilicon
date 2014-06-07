CRIPTION = "gstreamer hisilicon video sink"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=e431e272f5b8a6a4f948a910812f235e"

DEPENDS = "virtual/driverlibs-rdk-hisilicon gstreamer1.0 gstreamer1.0-plugins-base"

PV = "1.0+gitr${SRCPV}"

SRCREV = "edeae4badee5ffda7a91447ee8446ed7817ae2a9"
SRC_URI = "git://github.com/caps-liu/gst-hisivosink.git;protocol=https"

S = "${WORKDIR}/git"

inherit autotools
FILES_${PN} += "${libdir}/gstreamer-1.0/*.so"
FILES_${PN}-dbg += "${libdir}/gstreamer-1.0/.debug"
FILES_${PN}-dev += "${libdir}/gstreamer-1.0/*.la"
FILES_${PN}-staticdev += "${libdir}/gstreamer-1.0/*.a"

PACKAGE_ARCH = "${MACHINE_ARCH}"
