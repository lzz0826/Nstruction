# 使用更新的Ubuntu 18.04鏡像
FROM ubuntu:18.04

# 安裝SSH服務器和sudo工具
RUN apt-get update && \
    DEBIAN_FRONTEND=noninteractive apt-get install -y openssh-server sudo && \
    rm -rf /var/lib/apt/lists/* && \
    mkdir /var/run/sshd

# 創建一個新的用戶（你可以替換為你喜歡的用戶名）
RUN useradd -m -s /bin/bash admin && \
    echo 'admin:123456' | chpasswd && \
    echo 'admin ALL=(ALL) NOPASSWD:ALL' >> /etc/sudoers

# 允許root用戶通過SSH登錄
RUN sed -i 's/PermitRootLogin prohibit-password/PermitRootLogin yes/' /etc/ssh/sshd_config

# 允許密碼登錄（可選，如果你想使用密碼登錄）
# RUN sed -i 's/#PasswordAuthentication yes/PasswordAuthentication yes/' /etc/ssh/sshd_config

# 暴露SSH端口
EXPOSE 22

# 啟動SSH服務
CMD ["/usr/sbin/sshd", "-D"]
