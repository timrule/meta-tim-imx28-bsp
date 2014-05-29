include recipes-fsl/images/fsl-image-gui.bb

CORE_IMAGE_EXTRA_INSTALL += " \
        libsocketcan \
        canutils \
"

IMAGE_INSTALL += " \
        can-bus \
"

export IMAGE_BASENAME = "tim-image-imx28-bsp"

