DESCRIPTION = "Secure bootloader for Odroid devices supported by the hardkernel product"
SECTION = "bootloaders"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

S = "${WORKDIR}"

SRC_URI_odroid-c2 = "file://odroid-c2/bl1.bin.hardkernel"

SRC_URI = "\
    file://bl1.bin.hardkernel \
    file://bl2.bin.hardkernel \
    file://tzsw.bin.hardkernel \
    "

do_patch[noexec] = "1"
do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install_odroid-c2 () {
	install -d ${D}/boot
    	install -m 755  ${S}/odroid-c2/bl1.bin.hardkernel ${D}/boot
}

do_install () {
	install -d ${D}/boot
    	install -m 755  ${S}/bl1.bin.hardkernel ${D}/boot
    	install -m 755  ${S}/bl2.bin.hardkernel ${D}/boot
    	install -m 755  ${S}/tzsw.bin.hardkernel ${D}/boot
}

inherit deploy

do_deploy_odroid-c2 () {
    install -d ${DEPLOYDIR}
    install -m 755  ${S}/odroid-c2/bl1.bin.hardkernel ${DEPLOYDIR}
}
do_deploy () {
    install -d ${DEPLOYDIR}
    install -m 755  ${S}/bl1.bin.hardkernel ${DEPLOYDIR}
    install -m 755  ${S}/bl2.bin.hardkernel ${DEPLOYDIR}
    install -m 755  ${S}/tzsw.bin.hardkernel ${DEPLOYDIR}
}

FILES_${PN} = "/boot"

addtask deploy before do_build after do_compile

PACKAGE_ARCH = "${MACHINE_ARCH}"

COMPATIBLE_MACHINE  = "(odroid-xu3|odroid-xu4|odroid-xu3-lite|odroid-c2|odroid-hc1)"
