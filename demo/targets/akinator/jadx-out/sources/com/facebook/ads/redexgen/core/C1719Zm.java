package com.facebook.ads.redexgen.core;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.applovin.shadow.okio.Utf8;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: com.facebook.ads.redexgen.X.Zm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1719Zm extends Drawable {
    public static byte[] A0G;
    public static String[] A0H = {"uAADS07vuTt2bWOOIRXTK9bzUqfZPQ", "cn6RXotf6zZwAeB3lSiWP6IveEHpbDAc", "fqHIMQcIn36ckD7HtV78", "rZKbd1qqPOm2jxQd70eAyB6uz1tOgPbY", "sxaVjDfKgR8b2unSnmAv", "1UAN8XI5lzImEv5q", "fr57qg0eWkx6ppTTUiLmxnyxz7CpPvLf", "EJnXX6RVHz5b530rZ3EkT3HbTheO6nDW"};
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public String A04;
    public String A05;
    public String A06;
    public WeakReference<C2010eX> A07;
    public boolean A08;
    public final Paint A09 = new Paint();
    public final Paint A0A = new Paint();
    public final Path A0C = new Path();
    public final TextPaint A0E = new TextPaint();
    public final Paint A0B = new Paint();
    public final Handler A0D = new Handler();
    public final Runnable A0F = new C1328Kd(this);

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0G, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 15);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A0G = new byte[]{12, 26, 70, 121, 117, 103, 42, 48, 101, 42, 35, 101, 60, 48, 92, AbstractJsonLexerKt.TC_INVALID, 113, 116, 117, 116, 48, 0, 24, 4, 6, 24, 6, 29, Utf8.REPLACEMENT_BYTE, 44, 58, 126, 7, 32, 39, 58, 39, 47, 34, 39, 52, 39, 32, 41, 96, 96, 96, 110, 89, 86, 29, 83, 104, 109, 104, 105, 113, 104, 107, 84, 88, 74, 92, 95, 84, 81, 84, 73, 68, 29, 126, 85, 88, 94, 86, 88, 79, 29, 83, 82, 73, 29, 78, 88, 73, 60, 116, 122, 55, 89, 10, 75, 77, 69};
    }

    static {
        A04();
    }

    public C1719Zm() {
        this.A09.setColor(Color.argb(127, 36, 36, 36));
        this.A09.setStyle(Paint.Style.FILL_AND_STROKE);
        this.A0A.setAntiAlias(true);
        this.A0A.setColor(Color.argb(191, 0, 255, 0));
        this.A0A.setStrokeWidth(20.0f);
        this.A0A.setStyle(Paint.Style.STROKE);
        this.A0E.setAntiAlias(true);
        this.A0E.setColor(-1);
        this.A0E.setStyle(Paint.Style.FILL_AND_STROKE);
        this.A0E.setTextSize(30.0f);
        this.A0B.setColor(Color.argb(212, 0, 0, 0));
        this.A0B.setStyle(Paint.Style.FILL_AND_STROKE);
        A07();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A03() {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C1719Zm.A03():void");
    }

    public final void A07() {
        this.A00 = 0;
        this.A01 = -1;
        this.A05 = A02(32, 15, 65);
        this.A02 = 100;
        this.A06 = null;
        this.A03 = -1L;
        this.A07 = null;
        A0D(false);
    }

    public final void A08(int i10, int i11) {
        this.A00 = i10;
        this.A01 = i11;
        A03();
    }

    public final void A09(long j10) {
        this.A03 = j10;
        A03();
    }

    public final void A0A(C2010eX c2010eX) {
        this.A07 = new WeakReference<>(c2010eX);
        A03();
    }

    public final void A0B(String str) {
        this.A04 = str;
        A03();
    }

    public final void A0C(String str) {
        this.A06 = str;
        A03();
    }

    public final void A0D(boolean z10) {
        this.A08 = z10;
        if (this.A08) {
            this.A0D.post(this.A0F);
        } else {
            this.A0D.removeCallbacks(this.A0F);
        }
        invalidateSelf();
    }

    public final boolean A0E() {
        return this.A08;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (!this.A08) {
            return;
        }
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        canvas.drawRect(0.0f, 0.0f, width, height, this.A09);
        StaticLayout textLayout = new StaticLayout(this.A05, this.A0E, this.A02, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        float f10 = width / 2.0f;
        float f11 = height / 2.0f;
        float width2 = textLayout.getWidth() / 2.0f;
        float height2 = textLayout.getHeight() / 2.0f;
        float canvasMiddleY = f10 - width2;
        float textMiddleX = f11 - height2;
        float textMiddleY = f10 + width2;
        canvas.drawRect(canvasMiddleY - 40.0f, textMiddleX - 40.0f, textMiddleY + 40.0f, f11 + height2 + 40.0f, this.A0B);
        canvas.save();
        canvas.translate(f10 - width2, f11 - height2);
        textLayout.draw(canvas);
        canvas.restore();
        this.A0C.reset();
        this.A0C.moveTo(0.0f, 0.0f);
        this.A0C.lineTo(width, 0.0f);
        this.A0C.lineTo(width, height);
        this.A0C.lineTo(0.0f, height);
        this.A0C.lineTo(0.0f, 0.0f);
        canvas.drawPath(this.A0C, this.A0A);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
