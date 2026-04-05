package com.facebook.ads.redexgen.core;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.SystemClock;
import android.widget.Toast;
import com.applovin.shadow.okio.Utf8;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.facebook.ads.redexgen.X.Xf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1660Xf implements SensorEventListener {
    public static byte[] A0A;
    public static String[] A0B = {"Uaa3J2scapV8yes5b6pnu2IZk0LU1rHr", "LXJurOGNRLg3EZS8fSyHIDjya5ZXSJzZ", "hCsv3utrXnSLOEX2XFPv3VRLBGlOvh7o", "RmYGkVFgjEbS5IzY3jbSoV7saQb", "K5WWR24mbSYeRgwsb3gP0cRcHXaCk4OY", "QLQ7H5Nzwy1ReHmp", "O9fDe2IL", "IeHuYhXCHfpoc9Iu6CaN8EzSXeA"};
    public long A04;
    public long A05;
    public long A06;
    public SensorManager A07;
    public final C1937dL A08;
    public int A03 = 0;
    public float A00 = -1.0f;
    public float A01 = -1.0f;
    public float A02 = -1.0f;
    public final Set<InterfaceC1659Xe> A09 = new CopyOnWriteArraySet();

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A0B[5].length() != 16) {
                throw new RuntimeException();
            }
            A0B[6] = "nz7up3lN";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 34);
            i13++;
        }
    }

    public static void A02() {
        A0A = new byte[]{122, 76, 71, 90, 70, 91, 90, 9, 71, 70, 93, 9, 90, 92, 89, 89, 70, 91, 93, 76, 77, 5, 62, 55, 61, Utf8.REPLACEMENT_BYTE, 56, 49, 118, 56, 57, 34, 118, 37, 35, 38, 38, 57, 36, 34, 51, 50, 25, 15, 4, 25, 5, 24};
    }

    static {
        A02();
    }

    public C1660Xf(C1937dL c1937dL) {
        this.A08 = c1937dL;
    }

    private void A01() {
        this.A07 = (SensorManager) this.A08.getSystemService(A00(42, 6, 72));
        if (this.A07 == null) {
            Toast.makeText(this.A08, A00(0, 21, 11), 1).show();
        }
        boolean zRegisterListener = false;
        try {
            zRegisterListener = this.A07.registerListener(this, this.A07.getDefaultSensor(1), 3);
        } catch (Exception unused) {
            Toast.makeText(this.A08, A00(21, 21, 116), 1).show();
        }
        if (!zRegisterListener && this.A07 != null) {
            this.A07.unregisterListener(this);
        }
    }

    public final void A03(InterfaceC1659Xe interfaceC1659Xe) {
        if (this.A09.isEmpty()) {
            A01();
        } else if (this.A09.contains(interfaceC1659Xe)) {
            return;
        }
        this.A09.add(interfaceC1659Xe);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() != 1) {
            return;
        }
        long now = SystemClock.elapsedRealtime();
        if (now - this.A04 > 500) {
            this.A03 = 0;
        }
        if (now - this.A06 > 100) {
            float speed = (Math.abs(((((sensorEvent.values[0] + sensorEvent.values[1]) + sensorEvent.values[2]) - this.A00) - this.A01) - this.A02) / (now - this.A06)) * 10000.0f;
            if (speed > 800.0f) {
                int i10 = this.A03 + 1;
                this.A03 = i10;
                if (i10 >= 3 && now - this.A05 > 1000) {
                    this.A05 = now;
                    this.A03 = 0;
                    Iterator<InterfaceC1659Xe> it = this.A09.iterator();
                    while (it.hasNext()) {
                        it.next().AFD();
                    }
                }
                this.A04 = now;
            }
            this.A06 = now;
            this.A00 = sensorEvent.values[0];
            this.A01 = sensorEvent.values[1];
            this.A02 = sensorEvent.values[2];
        }
    }
}
