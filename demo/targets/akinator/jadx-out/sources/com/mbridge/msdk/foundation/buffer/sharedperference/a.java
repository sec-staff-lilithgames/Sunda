package com.mbridge.msdk.foundation.buffer.sharedperference;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.directory.e;
import com.mbridge.msdk.foundation.tools.FastKV;
import com.mbridge.msdk.foundation.tools.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    public static final String f40334b = "a";

    /* renamed from: c, reason: collision with root package name */
    private static a f40335c;

    /* renamed from: a, reason: collision with root package name */
    FastKV f40336a;

    private a() {
    }

    public static synchronized a b() {
        try {
            if (f40335c == null) {
                f40335c = new a();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f40335c;
    }

    public String a(String str) {
        try {
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                p0.a(f40334b, "get error: " + e10.getMessage());
            }
        }
        if (c.m().d() == null) {
            return null;
        }
        a();
        FastKV fastKV = this.f40336a;
        if (fastKV != null) {
            try {
                return fastKV.getString(str, "");
            } catch (Exception unused) {
                return "";
            }
        }
        return null;
    }

    public void c(String str) {
        if (c.m().d() == null) {
            return;
        }
        a();
        FastKV fastKV = this.f40336a;
        if (fastKV != null) {
            try {
                fastKV.remove(str);
            } catch (Exception unused) {
            }
        }
    }

    public Long b(String str) {
        try {
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                p0.a(f40334b, "getLong error: " + e10.getMessage());
            }
        }
        if (c.m().d() == null) {
            p0.b(f40334b, "context is null in get");
            return 0L;
        }
        a();
        FastKV fastKV = this.f40336a;
        if (fastKV != null) {
            try {
                return Long.valueOf(fastKV.getLong(str, 0L));
            } catch (Exception unused) {
                return 0L;
            }
        }
        return 0L;
    }

    public int a(String str, int i10) {
        try {
            if (c.m().d() != null) {
                a();
                FastKV fastKV = this.f40336a;
                if (fastKV != null) {
                    try {
                        return fastKV.getInt(str, i10);
                    } catch (Exception unused) {
                        return i10;
                    }
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                p0.a(f40334b, "getInt error: " + e10.getMessage());
            }
        }
        return i10;
    }

    public void b(String str, int i10) {
        try {
            if (c.m().d() == null) {
                return;
            }
            a();
            FastKV fastKV = this.f40336a;
            if (fastKV != null) {
                try {
                    fastKV.putInt(str, i10);
                } catch (Exception unused) {
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void a(String str, String str2) {
        try {
            if (c.m().d() == null) {
                return;
            }
            a();
            FastKV fastKV = this.f40336a;
            if (fastKV != null) {
                try {
                    fastKV.putString(str, str2);
                } catch (Exception unused) {
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                p0.a(f40334b, "put error: " + e10.getMessage());
            }
        }
    }

    public void a(String str, long j10) {
        try {
            if (c.m().d() == null) {
                p0.b(f40334b, "context is null in put");
                return;
            }
            a();
            FastKV fastKV = this.f40336a;
            if (fastKV != null) {
                try {
                    fastKV.putLong(str, j10);
                } catch (Exception unused) {
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                p0.a(f40334b, "putLong error: " + e10.getMessage());
            }
        }
    }

    private void a() {
        if (this.f40336a == null) {
            try {
                this.f40336a = new FastKV.Builder(e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_CONFIG), "mbridge").build();
            } catch (Exception unused) {
                this.f40336a = null;
            }
        }
    }
}
