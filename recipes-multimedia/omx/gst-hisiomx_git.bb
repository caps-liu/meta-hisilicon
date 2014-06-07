DEFAULT_PREFERENCE = "-1"

include gstreamer1.0-omx.inc

DEPENDS = "gstreamer1.0-plugins-bad"

LIC_FILES_CHKSUM = "file://COPYING;md5=4fbd65380cdd255951079008b364516c"

SRC_URI = " \
    git://github.com/caps-liu/gst-omx-1.0.0;branch=master \
    "
S = "${WORKDIR}/git"

SRCREV = "53ed95db02b30b13ab13cedfe00fb172000ef4fc"

do_configure() {
	./autogen.sh --noconfigure
	oe_runconf
}

