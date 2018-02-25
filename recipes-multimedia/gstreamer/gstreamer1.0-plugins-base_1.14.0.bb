require gstreamer1.0-plugins-base.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=c54ce9345727175ff66d17b67ff51f58 \
                    file://COPYING.LIB;md5=6762ed442b3822387a51c92d928ead0d \
                    file://common/coverage/coverage-report.pl;beginline=2;endline=17;md5=a4e1830fce078028c8f0974161272607"

SRC_URI = " \
    git://anongit.freedesktop.org/gstreamer/gst-plugins-base;branch=master;name=base \
    git://anongit.freedesktop.org/gstreamer/common;destsuffix=git/common;name=common \
    file://get-caps-from-src-pad-when-query-caps.patch \
    file://0003-ssaparse-enhance-SSA-text-lines-parsing.patch \
    file://make-gio_unix_2_0-dependency-configurable.patch \
    file://0001-introspection.m4-prefix-pkgconfig-paths-with-PKG_CON.patch \
    file://0005-gstreamer-gl.pc.in-don-t-append-GL_CFLAGS-to-CFLAGS.patch \
    file://0006-glimagesink-Downrank-to-marginal.patch \
    file://0007-Add-lvchostif-to-link-when-using-lEGL-on-rpi.patch \
    file://0008-gl-Add-DRM-cflags.patch \
"

SRCREV_base = "1a97338dc7ee381d1ab98adf76d47185e0c7ac2a"
SRCREV_common = "3fa2c9e372bceec30be91e67fb02b6cb05bed493"
SRCREV_FORMAT = "base"

S = "${WORKDIR}/git"

do_configure_prepend() {
	${S}/autogen.sh --noconfigure
}
