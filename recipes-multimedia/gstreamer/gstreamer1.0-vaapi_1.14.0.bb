require gstreamer1.0-vaapi.inc

SRCREV_base = "d18d6a8bd0d76b2874473fd4c6f9b3ddd4235ccd"
SRCREV_common = "3fa2c9e372bceec30be91e67fb02b6cb05bed493"
SRCREV_FORMAT = "base"

DEPENDS += "gstreamer1.0 gstreamer1.0-plugins-base gstreamer1.0-plugins-bad"

S = "${WORKDIR}/git"

do_configure_prepend() {
	${S}/autogen.sh --noconfigure
}
