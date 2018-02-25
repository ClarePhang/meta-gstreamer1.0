require gstreamer1.0.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=6762ed442b3822387a51c92d928ead0d \
                    file://gst/gst.h;beginline=1;endline=21;md5=e059138481205ee2c6fc1c079c016d0d"

SRC_URI = " \
    git://anongit.freedesktop.org/gstreamer/gstreamer;branch=master;name=base \
    git://anongit.freedesktop.org/gstreamer/common;destsuffix=git/common;name=common \
"

SRCREV_base = "91798e16cc09420163684d13779f13f374164ea2"
SRCREV_common = "3fa2c9e372bceec30be91e67fb02b6cb05bed493"
SRCREV_FORMAT = "base"

S = "${WORKDIR}/git"

do_configure_prepend() {
	${S}/autogen.sh --noconfigure
}
