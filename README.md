**English** | [繁體中文](README_CN.md)

# 📦 Pandora

[![](https://jitpack.io/v/ways22275/Pandora.svg)](https://jitpack.io/#ways22275/Pandora)
![Gradle](https://img.shields.io/badge/Gradle-8.5-blue.svg)
![AGP](https://img.shields.io/badge/AGP-8.2.2-brightgreen.svg)
![JDK](https://img.shields.io/badge/JDK-17-orange.svg)
![Kotlin](https://img.shields.io/badge/Kotlin-1.9.22-purple.svg)
![License](https://img.shields.io/badge/license-Apache%202.0-blue.svg)

Pandora 是一款強大且直覺的 Android 應用內偵錯工具箱（由 `ways22275` 獨立維護專案）。
無需連接電腦或 ROOT 權限，即可直接在 App 內檢視網路請求、沙盒檔案、SQLite 數據庫與 UI 視圖層級。

---

## 🌟 本專案重構與現代化特色

- ⚡ **最新建置架構**：全面升級至 **Gradle 8.5**、**AGP 8.2.2** 與 **Java 17**。
- 📦 **Gradle Version Catalog**：採用 `gradle/libs.versions.toml` 進行模組與依賴項的統一版本控管。
- 🎯 **獨立命名空間與 Package**：Group ID 為 `tech.kw`，Package Name 為 `tech.kw.pandora`。
- 🚀 **現代化 Plugins DSL**：採用 `plugins { ... }` DSL，提供更佳的 Gradle Sync 與 Task 編譯效能。

---

## 🚀 快速開始 (JitPack)

### 1. 新增 JitPack Repository

在專案根目錄的 `settings.gradle` 中新增 JitPack 來源：

```groovy
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url 'https://jitpack.io' }
    }
}
```

### 2. 引入套件依賴

#### 方式 A：透過 Version Catalog (`gradle/libs.versions.toml`) 引用（推薦）

在您的 `gradle/libs.versions.toml` 中加入：

```toml
[versions]
pandora = "v1.0.0" # 最新發布版本 Tag

[libraries]
pandora-debug = { module = "com.github.ways22275.Pandora:pandora-core", version.ref = "pandora" }
```

在 App 模組的 `app/build.gradle` 中引導：

```groovy
dependencies {
    debugImplementation libs.pandora.debug
}
```

---

#### 方式 B：傳統 Gradle 引用

在 App 模組的 `app/build.gradle` 中直接加入：

```groovy
dependencies {
    // 僅在 Debug 偵錯環境下引入 Pandora
    debugImplementation 'com.github.ways22275.Pandora:pandora-core:v1.0.0'
}
```

---

## 💡 初始化與使用

在您的 `Application` 類別中完成初始化與啟動：

### Java
```java
import tech.kw.pandora.Pandora; // 👈 最新套件 Package

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        
        // 啟動 Pandora 工具箱
        Pandora.get().open();
    }
}
```

### Kotlin
```kotlin
import tech.kw.pandora.Pandora // 👈 最新套件 Package

class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()
        
        // 啟動 Pandora 工具箱
        Pandora.get().open()
    }
}
```

---

## 🛠️ 主要功能

- **網路日誌 (Network Logs)**：實時查看 HTTP/HTTPS 請求 Header、Body 與響應日誌。
- **沙盒文件管理 (Sandbox)**：瀏覽應用私有目錄檔案、編輯 SharedPreferences 與 SQLite 數據庫。
- **UI 偵錯 (UI Inspection)**：實時查看與修改 View 屬性、檢測元件邊界與對齊基準線、查看 Activity/Dialog 視圖層級。
- **實用工具 (Utilities)**：Activity 生命週期追蹤、Crash 日誌捕捉與自訂快捷方式。

---

## 📄 開源許可證

本專案採用 [Apache-2.0 License](LICENSE)。