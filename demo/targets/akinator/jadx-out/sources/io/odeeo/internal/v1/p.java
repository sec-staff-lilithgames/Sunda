package io.odeeo.internal.v1;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final a f67286a = new a(null);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a() {
        }

        public final String getResponse(InputStream inputStream) {
            InputStreamReader inputStreamReader;
            e0.checkNotNullParameter(inputStream, "inputStream");
            StringBuilder sb2 = new StringBuilder();
            try {
                try {
                    inputStreamReader = new InputStreamReader(inputStream);
                } catch (Exception e10) {
                    io.odeeo.internal.b2.a.i("Error while reading input stream from response", e10);
                }
                try {
                    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                    while (true) {
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            sb2.append(line);
                        } finally {
                        }
                    }
                    gv.d.closeFinally(bufferedReader, null);
                    gv.d.closeFinally(inputStreamReader, null);
                    gv.d.closeFinally(inputStream, null);
                    String string = sb2.toString();
                    e0.checkNotNullExpressionValue(string, "result.toString()");
                    return string;
                } finally {
                }
            } finally {
            }
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }
}
