require gstreamer1.0-python.inc

SRC_URI = "git://anongit.freedesktop.org/gstreamer/gst-python;branch=master;name=base \
           git://anongit.freedesktop.org/gstreamer/common;destsuffix=git/common;name=common \
          "
SRCREV_base = "2818bf30123333ef1fe46f4f15c8ed3201399f9a"
SRCREV_common = "d7ecca16114e443dab9d6f8cbc47a1554e3d4b30"
SRCREV_FORMAT = "base"

S = "${WORKDIR}/git"

LIC_FILES_CHKSUM = "file://COPYING;md5=c34deae4e395ca07e725ab0076a5f740"

do_configure_prepend() {
	cd ${S}
	${S}/autogen.sh --noconfigure
	cd ${B}
}
