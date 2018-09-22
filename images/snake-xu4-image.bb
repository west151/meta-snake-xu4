SUMMARY = "Snake base image"
HOMEPAGE = "gis1501@gmail.com"
LICENSE = "MIT"

require console-image.bb

I2C_TOOLS = " \
    i2c-tools \
"

QT_TOOLS = " \
    qtbase \
    qtbase-plugins \
    qtbase-tools \
    qt5-env \
"

QT_DEV_TOOLS = " \
    qtbase-dev \
    qtbase-mkspecs \
"

QT5_DEV_PKGS = " \
    qtcharts-dev \
    qtcharts-mkspecs \
    qtconnectivity-dev \
    qtconnectivity-mkspecs \
    qtdeclarative-dev \
    qtdeclarative-mkspecs \
    qtgraphicaleffects-dev \
    qtlocation-dev \
    qtlocation-mkspecs \
    qtmultimedia-dev \
    qtmultimedia-mkspecs \
    qtquickcontrols2-dev \
    qtquickcontrols2-mkspecs \
    qtsensors-dev \
    qtsensors-mkspecs \
    qtserialbus-dev \
    qtserialbus-mkspecs \
    qtsvg-dev \
    qtsvg-mkspecs \
    qtwebsockets-dev \
    qtwebsockets-mkspecs \
    qtvirtualkeyboard-dev \
    qtxmlpatterns-dev \
    qtxmlpatterns-mkspecs \
    qtserialport-dev \
    qtserialport-mkspecs \
    qtmqtt-dev \
    qtmqtt-mkspecs \
"
QT5_PKGS = " \
    qtcharts \
    qtdeclarative \
    qtdeclarative-plugins \
    qtdeclarative-qmlplugins \
    qtgraphicaleffects \
    qtlocation-plugins \
    qtmultimedia \
    qtquickcontrols2 \
    qtsensors-plugins \
    qtserialbus \
    qtsvg \
    qtwebsockets-qmlplugins \
    qtvirtualkeyboard \
    qtxmlpatterns \
    qtserialport \
    qtmqtt \
"

QT5_3D_PKGS = " \
    qt3d \
"

QT5_3D_DEV_PKGS = " \
    qt3d-dev \
    qt3d-mkspecs \
"

QT5_WEBENGINE_PKGS = " \
    qtwebengine \
"

QT5_DEV_WEBENGINE_PKGS = " \
    qtwebengine-dev \
    qtwebengine-mkspecs \
"

OPENMP = " \
    libgomp \
"

OPENMP_DEV = " \
    libgomp-dev \
    libgomp-staticdev \
"

MQTT = " \
    libmosquitto1 \
    libmosquittopp1 \
    mosquitto \
    mosquitto-clients \
"

MQTT_DEV = " \
    mosquitto-dev \
    python-paho-mqtt \
"

SDR = " \
    volk \
    libhackrf \
    rtl-sdr \
    asn1c \
    libfftwf \
"

IMAGE_INSTALL += " \
    ${I2C_TOOLS} \
    ${QT_TOOLS} \
    ${QT_DEV_TOOLS} \
    ${QT5_PKGS} \
    ${QT5_DEV_PKGS} \
    ${QT5_3D_PKGS} \
    ${QT5_3D_DEV_PKGS} \
    ${OPENMP} \
    ${OPENMP_DEV} \
    ${MQTT} \
    ${MQTT_DEV} \
    ${SDR} \
"

export IMAGE_BASENAME = "snake-xu4-image"

