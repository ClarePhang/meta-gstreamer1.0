require gstreamer1.0-rtsp-server.inc

SRC_URI += "file://0002-rtsp-media-Fix-g_print-format-string.patch"

SRCREV_base = "ddb0d83844d0fe6c3c53c1d64bab7add948db0f7"
SRCREV_common = "3fa2c9e372bceec30be91e67fb02b6cb05bed493"
SRCREV_FORMAT = "base"

LIC_FILES_CHKSUM = "file://COPYING;md5=6762ed442b3822387a51c92d928ead0d"
