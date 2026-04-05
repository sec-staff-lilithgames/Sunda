package com.squareup.picasso;

import android.util.Log;
import e3.g;
import h2.rl.UeklptUrP;
import java.io.PrintWriter;
import java.io.StringWriter;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class StatsSnapshot {
    public final long averageDownloadSize;
    public final long averageOriginalBitmapSize;
    public final long averageTransformedBitmapSize;
    public final long cacheHits;
    public final long cacheMisses;
    public final int downloadCount;
    public final int maxSize;
    public final int originalBitmapCount;
    public final int size;
    public final long timeStamp;
    public final long totalDownloadSize;
    public final long totalOriginalBitmapSize;
    public final long totalTransformedBitmapSize;
    public final int transformedBitmapCount;

    public StatsSnapshot(int i10, int i11, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, int i12, int i13, int i14, long j18) {
        this.maxSize = i10;
        this.size = i11;
        this.cacheHits = j10;
        this.cacheMisses = j11;
        this.totalDownloadSize = j12;
        this.totalOriginalBitmapSize = j13;
        this.totalTransformedBitmapSize = j14;
        this.averageDownloadSize = j15;
        this.averageOriginalBitmapSize = j16;
        this.averageTransformedBitmapSize = j17;
        this.downloadCount = i12;
        this.originalBitmapCount = i13;
        this.transformedBitmapCount = i14;
        this.timeStamp = j18;
    }

    public void dump() {
        StringWriter stringWriter = new StringWriter();
        dump(new PrintWriter(stringWriter));
        Log.i("Picasso", stringWriter.toString());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("StatsSnapshot{maxSize=");
        sb2.append(this.maxSize);
        sb2.append(", size=");
        sb2.append(this.size);
        sb2.append(UeklptUrP.CgSnfVduumbTyZ);
        sb2.append(this.cacheHits);
        sb2.append(", cacheMisses=");
        sb2.append(this.cacheMisses);
        sb2.append(", downloadCount=");
        sb2.append(this.downloadCount);
        sb2.append(", totalDownloadSize=");
        sb2.append(this.totalDownloadSize);
        sb2.append(", averageDownloadSize=");
        sb2.append(this.averageDownloadSize);
        sb2.append(", totalOriginalBitmapSize=");
        sb2.append(this.totalOriginalBitmapSize);
        sb2.append(", totalTransformedBitmapSize=");
        sb2.append(this.totalTransformedBitmapSize);
        sb2.append(", averageOriginalBitmapSize=");
        sb2.append(this.averageOriginalBitmapSize);
        sb2.append(", averageTransformedBitmapSize=");
        sb2.append(this.averageTransformedBitmapSize);
        sb2.append(", originalBitmapCount=");
        sb2.append(this.originalBitmapCount);
        sb2.append(", transformedBitmapCount=");
        sb2.append(this.transformedBitmapCount);
        sb2.append(", timeStamp=");
        return g.n(sb2, this.timeStamp, AbstractJsonLexerKt.END_OBJ);
    }

    public void dump(PrintWriter printWriter) {
        printWriter.println("===============BEGIN PICASSO STATS ===============");
        printWriter.println("Memory Cache Stats");
        printWriter.print("  Max Cache Size: ");
        printWriter.println(this.maxSize);
        printWriter.print("  Cache Size: ");
        printWriter.println(this.size);
        printWriter.print("  Cache % Full: ");
        printWriter.println((int) Math.ceil((this.size / this.maxSize) * 100.0f));
        printWriter.print("  Cache Hits: ");
        printWriter.println(this.cacheHits);
        printWriter.print("  Cache Misses: ");
        printWriter.println(this.cacheMisses);
        printWriter.println("Network Stats");
        printWriter.print("  Download Count: ");
        printWriter.println(this.downloadCount);
        printWriter.print("  Total Download Size: ");
        printWriter.println(this.totalDownloadSize);
        printWriter.print("  Average Download Size: ");
        printWriter.println(this.averageDownloadSize);
        printWriter.println("Bitmap Stats");
        printWriter.print("  Total Bitmaps Decoded: ");
        printWriter.println(this.originalBitmapCount);
        printWriter.print("  Total Bitmap Size: ");
        printWriter.println(this.totalOriginalBitmapSize);
        printWriter.print("  Total Transformed Bitmaps: ");
        printWriter.println(this.transformedBitmapCount);
        printWriter.print("  Total Transformed Bitmap Size: ");
        printWriter.println(this.totalTransformedBitmapSize);
        printWriter.print("  Average Bitmap Size: ");
        printWriter.println(this.averageOriginalBitmapSize);
        printWriter.print("  Average Transformed Bitmap Size: ");
        printWriter.println(this.averageTransformedBitmapSize);
        printWriter.println("===============END PICASSO STATS ===============");
        printWriter.flush();
    }
}
