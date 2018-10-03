SUMMARY = "QSweep"
HOMEPAGE = "gis1501@gmail.com"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS += "qtbase fftwf libhackrf qtmqtt"

PR = "r1"

SRCREV = "${AUTOREV}"
SRC_URI = "git://github.com/west151/qsweep.git"

S = "${WORKDIR}/git"

require recipes-qt/qt5/qt5.inc

QMAKE_PROFILES = "${S}/qsweep-srv.pro"

qmake_base() {
}

do_install() {
    install -d ${WORKDIR}/opt/qsweep/bin
    install -m 0755 ${S}/bin/* ${WORKDIR}/opt/qsweep/bin
    install -m 0755 ${S}/install/config/qsweepserver.config ${WORKDIR}/opt/qsweep/bin/qsweepserver.config
}

FILES_${PN} = "/opt/qsweep/bin"

RDEPENDS_${PN} = "qtbase-plugins"
