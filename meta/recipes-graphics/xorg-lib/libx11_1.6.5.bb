require libx11.inc
inherit gettext

BBCLASSEXTEND = "native nativesdk"

SRC_URI += "file://disable_tests.patch \
           "

SRC_URI[md5sum] = "0f618db70c4054ca67cee0cc156a4255"
SRC_URI[sha256sum] = "4d3890db2ba225ba8c55ca63c6409c1ebb078a2806de59fb16342768ae63435d"
