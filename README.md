# MavenMultiModule
這是一個使用練習使用Maven管理多模塊專案，專案中包含了父項目和兩個子模塊。本專案用於展示如何使用Maven組織和管理多個Java項目。

結構
parent-project: 父項目，用於管理子模塊的共享配置。
webapp: Web應用程式模塊，將vue-page打包後的文件佈置靜態資源目錄，Spring Boot會設置導頁相關路徑。
utils: 工具庫模塊。
vue-page: vue3頁面
