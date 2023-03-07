package site.derker.alist.alist.android.model

import java.util.Date

/**
 * 文件或目录
 */
data class File(
    var name: String, // 文件名
    var type: FileType, // 文件类型
    var size: Long?, // 文件大小
    var thumbnail: String?, // 文件缩略图
    var createdTime: Date?, // 文件创建日期
    var modifiedTime: Date?, // 文件最近修改日期
    var src: String?, // 文件源地址
)
