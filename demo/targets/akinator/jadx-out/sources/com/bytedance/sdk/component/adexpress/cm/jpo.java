package com.bytedance.sdk.component.adexpress.cm;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.HardwareRenderer;
import android.graphics.Paint;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import androidx.core.app.NotificationCompat;
import java.lang.reflect.Array;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.renderscript.BaseObj] */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.renderscript.BaseObj, android.renderscript.ScriptIntrinsicBlur] */
    public static Bitmap jd(Context context, Bitmap bitmap, int i10) {
        RenderScript renderScriptCreate;
        Allocation allocationCreateFromBitmap;
        ?? Create;
        Allocation allocationCreateFromBitmap2;
        com.bytedance.sdk.component.adexpress.jpo.jpo.wqx wqxVarWqx;
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap);
            renderScriptCreate = RenderScript.create(context);
            if (renderScriptCreate == null) {
                try {
                    com.bytedance.sdk.component.adexpress.jpo.jpo.wqx wqxVarWqx2 = com.bytedance.sdk.component.adexpress.jpo.jpo.jpo.jpo().wqx();
                    if (wqxVarWqx2 == null || !wqxVarWqx2.sq() || renderScriptCreate == null) {
                        return null;
                    }
                    RenderScript.releaseAllContexts();
                    return null;
                } catch (Throwable th2) {
                    th2.getMessage();
                    return null;
                }
            }
            try {
                Create = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
                try {
                    allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmap);
                    try {
                        allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
                        try {
                            Create.setRadius(i10);
                            Create.setInput(allocationCreateFromBitmap);
                            Create.forEach(allocationCreateFromBitmap2);
                            allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
                            try {
                                com.bytedance.sdk.component.adexpress.jpo.jpo.wqx wqxVarWqx3 = com.bytedance.sdk.component.adexpress.jpo.jpo.jpo.jpo().wqx();
                                if (wqxVarWqx3 != null && wqxVarWqx3.sq()) {
                                    RenderScript.releaseAllContexts();
                                    if (allocationCreateFromBitmap != null) {
                                        allocationCreateFromBitmap.destroy();
                                    }
                                    allocationCreateFromBitmap2.destroy();
                                    Create.destroy();
                                }
                            } catch (Throwable th3) {
                                th3.getMessage();
                            }
                            return bitmapCreateBitmap;
                        } catch (Throwable th4) {
                            th = th4;
                            try {
                                th.getMessage();
                                try {
                                    wqxVarWqx = com.bytedance.sdk.component.adexpress.jpo.jpo.jpo.jpo().wqx();
                                    return wqxVarWqx == null ? null : null;
                                } catch (Throwable th5) {
                                    th5.getMessage();
                                    return null;
                                }
                            } catch (Throwable th6) {
                                try {
                                    com.bytedance.sdk.component.adexpress.jpo.jpo.wqx wqxVarWqx4 = com.bytedance.sdk.component.adexpress.jpo.jpo.jpo.jpo().wqx();
                                    if (wqxVarWqx4 != null && wqxVarWqx4.sq()) {
                                        if (renderScriptCreate != null) {
                                            RenderScript.releaseAllContexts();
                                        }
                                        if (allocationCreateFromBitmap != null) {
                                            allocationCreateFromBitmap.destroy();
                                        }
                                        if (allocationCreateFromBitmap2 != null) {
                                            allocationCreateFromBitmap2.destroy();
                                        }
                                        if (Create != 0) {
                                            Create.destroy();
                                        }
                                    }
                                } catch (Throwable th7) {
                                    th7.getMessage();
                                }
                                throw th6;
                            }
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        allocationCreateFromBitmap2 = null;
                    }
                } catch (Throwable th9) {
                    th = th9;
                    allocationCreateFromBitmap = null;
                    allocationCreateFromBitmap2 = null;
                }
            } catch (Throwable th10) {
                th = th10;
                allocationCreateFromBitmap = null;
                Create = allocationCreateFromBitmap;
                allocationCreateFromBitmap2 = Create;
                th.getMessage();
                wqxVarWqx = com.bytedance.sdk.component.adexpress.jpo.jpo.jpo.jpo().wqx();
                if (wqxVarWqx == null && wqxVarWqx.sq()) {
                    if (renderScriptCreate != null) {
                        RenderScript.releaseAllContexts();
                    }
                    if (allocationCreateFromBitmap != null) {
                        allocationCreateFromBitmap.destroy();
                    }
                    if (allocationCreateFromBitmap2 != null) {
                        allocationCreateFromBitmap2.destroy();
                    }
                    if (Create == 0) {
                        return null;
                    }
                    Create.destroy();
                    return null;
                }
            }
        } catch (Throwable th11) {
            th = th11;
            renderScriptCreate = null;
            allocationCreateFromBitmap = null;
        }
    }

    public static Bitmap jpo(Context context, Bitmap bitmap, int i10) {
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.round(bitmap.getWidth() * 0.2f), Math.round(bitmap.getHeight() * 0.2f), false);
            return com.bytedance.sdk.component.adexpress.cm.cm() == 0 ? jd(context, bitmapCreateScaledBitmap, i10) : com.bytedance.sdk.component.adexpress.cm.cm() == 1 ? jpo(bitmapCreateScaledBitmap, i10) : jd(bitmapCreateScaledBitmap, i10);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Bitmap jpo(Bitmap bitmap, int i10) {
        int i11;
        int i12;
        int i13 = i10;
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i14 = width * height;
            int[] iArr = new int[i14];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            int[] iArr2 = iArr;
            int i15 = width - 1;
            int i16 = height - 1;
            int i17 = i13 + i13;
            int i18 = i17 + 1;
            char c10 = 2;
            int i19 = (i17 + 2) >> 1;
            int i20 = i19 * i19;
            int[] iArr3 = new int[Math.max(width, height)];
            int i21 = i20 * NotificationCompat.FLAG_LOCAL_ONLY;
            int[] iArr4 = new int[i21];
            int[] iArr5 = new int[i14];
            int[] iArr6 = new int[i14];
            int[] iArr7 = new int[i14];
            int i22 = 0;
            for (int i23 = 0; i23 < i21; i23++) {
                iArr4[i23] = i23 / i20;
            }
            int[][] iArr8 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i18, 3);
            int i24 = i13 + 1;
            int i25 = 0;
            int i26 = 0;
            int i27 = 0;
            while (i25 < height) {
                char c11 = c10;
                int i28 = -i13;
                int i29 = i22;
                int i30 = i29;
                int i31 = i30;
                int i32 = i31;
                int i33 = i32;
                int i34 = i33;
                int i35 = i34;
                int i36 = i35;
                int i37 = i36;
                while (i28 <= i13) {
                    int[] iArr9 = iArr2;
                    int[][] iArr10 = iArr8;
                    int i38 = iArr9[i26 + Math.min(i15, Math.max(i28, i22))];
                    int[] iArr11 = iArr10[i28 + i13];
                    iArr11[0] = (i38 & 16711680) >> 16;
                    iArr11[1] = (i38 & 65280) >> 8;
                    iArr11[c11] = i38 & 255;
                    int iAbs = i24 - Math.abs(i28);
                    int i39 = iArr11[0];
                    i29 = (i39 * iAbs) + i29;
                    int i40 = iArr11[1];
                    i30 = (i40 * iAbs) + i30;
                    int i41 = iArr11[c11];
                    i31 = (iAbs * i41) + i31;
                    if (i28 <= 0) {
                        i33 += i39;
                        i35 += i40;
                        i37 += i41;
                    } else {
                        i32 += i39;
                        i34 += i40;
                        i36 += i41;
                    }
                    i28++;
                    iArr2 = iArr9;
                    iArr8 = iArr10;
                    i22 = 0;
                }
                int[] iArr12 = iArr2;
                int[][] iArr13 = iArr8;
                int i42 = i13;
                int i43 = 0;
                while (i43 < width) {
                    iArr5[i26] = iArr4[i29];
                    iArr6[i26] = iArr4[i30];
                    iArr7[i26] = iArr4[i31];
                    int[] iArr14 = iArr13[((i42 - i13) + i18) % i18];
                    int i44 = i29 - i33;
                    int i45 = i30 - i35;
                    int i46 = i31 - i37;
                    int i47 = i33 - iArr14[0];
                    int i48 = i35 - iArr14[1];
                    int i49 = i37 - iArr14[c11];
                    if (i25 == 0) {
                        i12 = i43;
                        iArr3[i12] = Math.min(i43 + i13 + 1, i15);
                    } else {
                        i12 = i43;
                    }
                    int i50 = iArr12[i27 + iArr3[i12]];
                    int i51 = (i50 & 16711680) >> 16;
                    iArr14[0] = i51;
                    int i52 = (i50 & 65280) >> 8;
                    iArr14[1] = i52;
                    int i53 = i50 & 255;
                    iArr14[c11] = i53;
                    int i54 = i32 + i51;
                    int i55 = i34 + i52;
                    int i56 = i36 + i53;
                    i42 = (i42 + 1) % i18;
                    int[] iArr15 = iArr13[i42 % i18];
                    i29 = i44 + i54;
                    i30 = i45 + i55;
                    i31 = i46 + i56;
                    int i57 = iArr15[0];
                    i32 = i54 - i57;
                    int i58 = iArr15[1];
                    i34 = i55 - i58;
                    int i59 = iArr15[c11];
                    i36 = i56 - i59;
                    i33 = i47 + i57;
                    i35 = i48 + i58;
                    i37 = i49 + i59;
                    i26++;
                    i43 = i12 + 1;
                }
                i27 += width;
                i25++;
                c10 = c11;
                iArr2 = iArr12;
                iArr8 = iArr13;
                i22 = 0;
            }
            int[] iArr16 = iArr2;
            int[][] iArr17 = iArr8;
            char c12 = c10;
            int i60 = 0;
            while (i60 < width) {
                int i61 = -i13;
                int i62 = i61 * width;
                int i63 = 0;
                int i64 = 0;
                int i65 = 0;
                int i66 = 0;
                int i67 = 0;
                int i68 = 0;
                int i69 = 0;
                int i70 = 0;
                int i71 = 0;
                while (i61 <= i13) {
                    int[] iArr18 = iArr17[i61 + i13];
                    int iMax = Math.max(0, i62) + i60;
                    int iAbs2 = i24 - Math.abs(i61);
                    int i72 = iArr5[iMax];
                    i63 = (i72 * iAbs2) + i63;
                    i64 = (iArr6[iMax] * iAbs2) + i64;
                    i65 = (iArr7[iMax] * iAbs2) + i65;
                    iArr18[0] = i72;
                    int i73 = iArr6[iMax];
                    iArr18[1] = i73;
                    int i74 = iArr7[iMax];
                    iArr18[c12] = i74;
                    if (i61 <= 0) {
                        i67 += i72;
                        i69 += i73;
                        i71 += i74;
                    } else {
                        i66 += i72;
                        i68 += i73;
                        i70 += i74;
                    }
                    if (i61 < i16) {
                        i62 += width;
                    }
                    i61++;
                    i13 = i10;
                }
                int i75 = i10;
                int i76 = i60;
                int i77 = 0;
                while (i77 < height) {
                    iArr16[i76] = (iArr16[i76] & (-16777216)) | (iArr4[i63] << 16) | (iArr4[i64] << 8) | iArr4[i65];
                    int[] iArr19 = iArr17[((i75 - i10) + i18) % i18];
                    int i78 = i63 - i67;
                    int i79 = i64 - i69;
                    int i80 = i65 - i71;
                    int i81 = i67 - iArr19[0];
                    int i82 = i69 - iArr19[1];
                    int i83 = i71 - iArr19[c12];
                    if (i60 == 0) {
                        i11 = i77;
                        iArr3[i11] = Math.min(i11 + i24, i16) * width;
                    } else {
                        i11 = i77;
                    }
                    int i84 = iArr3[i11] + i60;
                    int i85 = iArr5[i84];
                    iArr19[0] = i85;
                    int i86 = iArr6[i84];
                    iArr19[1] = i86;
                    int i87 = iArr7[i84];
                    iArr19[c12] = i87;
                    int i88 = i66 + i85;
                    int i89 = i68 + i86;
                    int i90 = i70 + i87;
                    i63 = i78 + i88;
                    i64 = i79 + i89;
                    i65 = i80 + i90;
                    i75 = (i75 + 1) % i18;
                    int[] iArr20 = iArr17[i75];
                    int i91 = iArr20[0];
                    i66 = i88 - i91;
                    int i92 = iArr20[1];
                    i68 = i89 - i92;
                    int i93 = iArr20[c12];
                    i70 = i90 - i93;
                    i67 = i81 + i91;
                    i69 = i82 + i92;
                    i71 = i83 + i93;
                    i76 += width;
                    i77 = i11 + 1;
                }
                i60++;
                i13 = i10;
            }
            bitmap.setPixels(iArr16, 0, width, 0, 0, width, height);
            return bitmap;
        } catch (Throwable th2) {
            th2.getMessage();
            return null;
        }
    }

    public static Bitmap jd(Bitmap bitmap, int i10) {
        try {
            if (Build.VERSION.SDK_INT < 31) {
                return jpo(bitmap, i10);
            }
            ImageReader imageReaderNewInstance = ImageReader.newInstance(bitmap.getWidth(), bitmap.getHeight(), 1, 1, 768L);
            RenderNode renderNode = new RenderNode("BlurEffect");
            HardwareRenderer hardwareRenderer = new HardwareRenderer();
            hardwareRenderer.setSurface(imageReaderNewInstance.getSurface());
            hardwareRenderer.setContentRoot(renderNode);
            renderNode.setPosition(0, 0, imageReaderNewInstance.getWidth(), imageReaderNewInstance.getHeight());
            float f10 = i10;
            renderNode.setRenderEffect(RenderEffect.createBlurEffect(f10, f10, Shader.TileMode.MIRROR));
            renderNode.beginRecording().drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            renderNode.endRecording();
            hardwareRenderer.createRenderRequest().setWaitForPresent(true).syncAndDraw();
            Image imageAcquireNextImage = imageReaderNewInstance.acquireNextImage();
            HardwareBuffer hardwareBuffer = imageAcquireNextImage.getHardwareBuffer();
            Bitmap bitmapWrapHardwareBuffer = Bitmap.wrapHardwareBuffer(hardwareBuffer, null);
            hardwareBuffer.close();
            imageAcquireNextImage.close();
            imageReaderNewInstance.close();
            renderNode.discardDisplayList();
            hardwareRenderer.destroy();
            return bitmapWrapHardwareBuffer;
        } catch (Throwable th2) {
            th2.getMessage();
            return jpo(bitmap, i10);
        }
    }
}
