package com.mbridge.msdk.util;

import android.text.TextUtils;
import com.amazon.device.ads.DtbConstants;
import com.ironsource.mediationsdk.logger.IronSourceError;
import i2.hQ.aTNDubNmpwAqdU;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class a {
    public static int b(int i10, String str) {
        return i10 + 900;
    }

    public static int a(int i10, String str) {
        int i11;
        try {
            if (!TextUtils.isEmpty(str)) {
                int i12 = 15;
                if (str.startsWith("errorCode: ") && str.length() > 16) {
                    return Integer.parseInt(str.substring(11, 15));
                }
                if (!str.equals("do not have sorceList")) {
                    if (!str.equals("Network error,UnknownHostException")) {
                        if (!str.equals("v3 is timeout")) {
                            if (!str.equals("Current unit is loading!") && !str.equals("current unit is loading")) {
                                if (!str.equals("Network error,I/O exception response null")) {
                                    if (!str.equals("Network error,ConnectException")) {
                                        if (!str.equals("Network error,socket timeout exception")) {
                                            if (!str.equals("Network error,disconnected network exception")) {
                                                if (!str.equals("Network error,timeout exception")) {
                                                    if (!str.startsWith("Network error,please check state code")) {
                                                        if (!str.equals("Network error,I/O exception contents null")) {
                                                            if (!str.equals("Network unknown error")) {
                                                                if (str.equals("Network error,I/O exception")) {
                                                                    i11 = i10 + 600;
                                                                    i12 = 13;
                                                                } else if (str.equals("web env is not support")) {
                                                                    i11 = i10 + 600;
                                                                    i12 = 14;
                                                                } else if (str.equals("Network error,unknown")) {
                                                                    i11 = i10 + 600;
                                                                } else if (str.equals("Network error，sslp exception")) {
                                                                    i11 = i10 + 600;
                                                                    i12 = 16;
                                                                } else if (str.startsWith("Cast exception, return data")) {
                                                                    i11 = i10 + 600;
                                                                    i12 = 17;
                                                                } else if (str.equals("REQUEST_TIMEOUT")) {
                                                                    i11 = i10 + IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED;
                                                                } else if (str.startsWith("The server returns an exception")) {
                                                                    i11 = i10 + IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED;
                                                                } else if (str.equals("APP ALREADY INSTALLED") || str.equals("Need show campaign list is NULL!")) {
                                                                    i11 = i10 + IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED;
                                                                } else if (str.startsWith("load no ad")) {
                                                                    i11 = i10 + IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED;
                                                                } else if (str.equals("EXCEPTION_UNIT_NOT_FOUND_IN_APP")) {
                                                                    i11 = i10 + IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED;
                                                                } else if (str.equals("EXCEPTION_UNIT_BIDDING_TYPE_ERROR")) {
                                                                    i11 = i10 + IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED;
                                                                } else if (str.equals(aTNDubNmpwAqdU.OiMDDfQCHbw)) {
                                                                    i11 = i10 + IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED;
                                                                } else if (str.equals("EXCEPTION_RETURN_EMPTY")) {
                                                                    i11 = i10 + IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED;
                                                                } else if (str.equals("EXCEPTION_APP_PLATFORM_ERROR")) {
                                                                    i11 = i10 + IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED;
                                                                } else if (str.equals("EXCEPTION_SERVICE_REQUEST_OS_VERSION_REQUIRED")) {
                                                                    i11 = i10 + IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED;
                                                                } else if (str.equals("banner res load failed")) {
                                                                    i11 = i10 + 800;
                                                                } else if (str.equals("resource load timeout is tpl: false")) {
                                                                    i11 = i10 + 800;
                                                                } else if (str.startsWith("resource download failed")) {
                                                                    i11 = i10 + 800;
                                                                } else if (str.equals("temp preload success but isReady false")) {
                                                                    i11 = i10 + 800;
                                                                } else if (str.equals("temp resource download failed")) {
                                                                    i11 = i10 + 800;
                                                                } else if (str.equals("tpl temp resource download failed")) {
                                                                    i11 = i10 + 800;
                                                                } else if (str.equals("resource load timeout is tpl: true")) {
                                                                    i11 = i10 + 800;
                                                                } else {
                                                                    if (!str.startsWith(DtbConstants.HTTPS) && !str.startsWith(DtbConstants.HTTP)) {
                                                                        if (str.equals("mraid resource write fail")) {
                                                                            i11 = i10 + 800;
                                                                        } else if (str.startsWith("data save failed:")) {
                                                                            i11 = i10 + 800;
                                                                        } else if (str.equals("resource load timeout")) {
                                                                            i11 = i10 + 800;
                                                                        } else if (str.startsWith("tpl temp preload failed")) {
                                                                            i11 = i10 + 800;
                                                                        }
                                                                    }
                                                                    i11 = i10 + 800;
                                                                }
                                                                return i11 + i12;
                                                            }
                                                            i11 = i10 + 600;
                                                            i12 = 12;
                                                            return i11 + i12;
                                                        }
                                                        i11 = i10 + 600;
                                                        i12 = 11;
                                                        return i11 + i12;
                                                    }
                                                    i11 = i10 + 600;
                                                    i12 = 10;
                                                    return i11 + i12;
                                                }
                                                i11 = i10 + 600;
                                                i12 = 9;
                                                return i11 + i12;
                                            }
                                            i11 = i10 + 600;
                                            i12 = 8;
                                            return i11 + i12;
                                        }
                                        i11 = i10 + 600;
                                        i12 = 7;
                                        return i11 + i12;
                                    }
                                    i11 = i10 + 600;
                                    i12 = 6;
                                    return i11 + i12;
                                }
                                i11 = i10 + 600;
                                i12 = 5;
                                return i11 + i12;
                            }
                            i11 = i10 + 600;
                            i12 = 4;
                            return i11 + i12;
                        }
                        i11 = i10 + 600;
                        i12 = 3;
                        return i11 + i12;
                    }
                    i11 = i10 + 600;
                    i12 = 2;
                    return i11 + i12;
                }
                i11 = i10 + 600;
                i12 = 1;
                return i11 + i12;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return i10;
    }
}
