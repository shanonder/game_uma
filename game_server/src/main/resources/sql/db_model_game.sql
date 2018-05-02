CREATE TABLE `tb_role` (
`id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
`uid` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
`role_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
`profession` int(11) NULL DEFAULT NULL,
`level` int(11) NULL DEFAULT NULL,
`exp` int(11) NULL DEFAULT NULL,
`skin` int(11) NULL DEFAULT NULL,
PRIMARY KEY (`id`) ,
UNIQUE INDEX `i_rolename` (`role_name`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8mb4 COLLATE=utf8mb4_general_ci;

CREATE TABLE `tb_user` (
`id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
`user_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
`password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
PRIMARY KEY (`id`) ,
UNIQUE INDEX `i_user_name` (`user_name`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8mb4 COLLATE=utf8mb4_general_ci;

