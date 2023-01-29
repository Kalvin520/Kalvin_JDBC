/*
{\rtf1\ansi\ansicpg950\cocoartf2639
\cocoatextscaling0\cocoaplatform0{\fonttbl}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
}
*/
CREATE Table Video(
    videoId INT auto_increment PRIMARY KEY,
    videoName VARCHAR(50) NULL,
    price INT NULL,
    CONSTRAINT Video_videoId_uindex UNIQUE(videoId)
)
