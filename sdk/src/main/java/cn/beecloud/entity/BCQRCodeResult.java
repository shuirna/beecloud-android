/**
 * BCQRCodeResult.java
 * <p/>
 * Created by xuanzhui on 2015/8/5.
 * Copyright (c) 2015 BeeCloud. All rights reserved.
 */
package cn.beecloud.entity;

import android.graphics.Bitmap;

/**
 * 用于存储支付二维码的数据
 */
public class BCQRCodeResult extends BCRestfulCommonResult {
    public static final int DEFAULT_QRCODE_HEIGHT = 360;
    public static final int DEFAULT_QRCODE_WIDTH = 360;

    private int qrCodeHeight = BCQRCodeResult.DEFAULT_QRCODE_HEIGHT;
    private int qrCodeWidth = BCQRCodeResult.DEFAULT_QRCODE_WIDTH;

    private String qrCodeRawContent;
    private Bitmap qrCodeBitmap;

    private String aliQRCodeHtml;

    /**
     * 无参构造
     */
    public BCQRCodeResult() {
    }

    /**
     * 构造函数
     *
     * @param resultCode 返回码
     * @param resultMsg  返回信息
     * @param errDetail  具体错误信息
     */
    public BCQRCodeResult(Integer resultCode, String resultMsg, String errDetail) {
        super(resultCode, resultMsg, errDetail);
    }

    /**
     * 构造函数
     *
     * @param resultCode        返回码
     * @param resultMsg         返回信息
     * @param errDetail         具体错误信息
     * @param qrCodeRawContent  原始用于生成二维码的字符串
     * @param qrCodeBitmap      二维码
     */
    public BCQRCodeResult(Integer resultCode, String resultMsg, String errDetail,
                          String qrCodeRawContent, Bitmap qrCodeBitmap) {
        super(resultCode, resultMsg, errDetail);
        this.qrCodeRawContent = qrCodeRawContent;
        this.qrCodeBitmap = qrCodeBitmap;
    }

    /**
     * 构造函数
     *
     * @param resultCode        返回码
     * @param resultMsg         返回信息
     * @param errDetail         具体错误信息
     * @param qrCodeHeight      二维码高度, 以px为单位
     * @param qrCodeWidth       二维码宽度, 以px为单位
     * @param qrCodeRawContent  原始用于生成二维码的字符串
     * @param qrCodeBitmap      二维码
     * @param aliQRCodeHtml     ALI_QRCODE内嵌二维码HTML
     */
    public BCQRCodeResult(Integer resultCode, String resultMsg, String errDetail,
                          Integer qrCodeHeight, Integer qrCodeWidth,
                          String qrCodeRawContent, Bitmap qrCodeBitmap,
                          String aliQRCodeHtml) {
        super(resultCode, resultMsg, errDetail);
        this.qrCodeHeight = qrCodeHeight;
        this.qrCodeWidth = qrCodeWidth;
        this.qrCodeRawContent = qrCodeRawContent;
        this.qrCodeBitmap = qrCodeBitmap;
        this.aliQRCodeHtml = aliQRCodeHtml;
    }

    /**
     * @return  二维码高度, 以px为单位
     */
    public int getQrCodeHeight() {
        return qrCodeHeight;
    }

    /**
     * @return  二维码宽度, 以px为单位
     */
    public int getQrCodeWidth() {
        return qrCodeWidth;
    }

    /**
     * @return  原始用于生成二维码的字符串
     */
    public String getQrCodeRawContent() {
        return qrCodeRawContent;
    }

    /**
     * @return  二维码
     */
    public Bitmap getQrCodeBitmap() {
        return qrCodeBitmap;
    }

    /**
     * @return  ALI_QRCODE内嵌二维码HTML
     */
    public String getAliQRCodeHtml() {
        return aliQRCodeHtml;
    }

    /**
     * 将json串转化为BCQRCodeResult实例
     *
     * @param jsonStr json串
     * @return BCQRCodeResult实例
     */
    @Override
    public BCRestfulCommonResult transJsonToResultObject(String jsonStr) {
        return null;
    }
}
