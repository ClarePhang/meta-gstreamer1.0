include gstreamer1.0-omx.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=4fbd65380cdd255951079008b364516c \
                    file://omx/gstomx.h;beginline=1;endline=21;md5=5c8e1fca32704488e76d2ba9ddfa935f"

SRC_URI = " \
    git://anongit.freedesktop.org/gstreamer/gst-omx;branch=master;name=gst-omx \
    git://anongit.freedesktop.org/gstreamer/common;destsuffix=git/common;branch=master;name=common \
"

SRCREV_gst-omx = "692156816122f6d87ee97e505f7469d3152a0cb9"
SRCREV_common = "3fa2c9e372bceec30be91e67fb02b6cb05bed493"
SRCREV_FORMAT = "gst-omx"

S = "${WORKDIR}/git"

do_configure_prepend() {
	cd ${S}
	./autogen.sh --noconfigure
	cd ${B}
}
