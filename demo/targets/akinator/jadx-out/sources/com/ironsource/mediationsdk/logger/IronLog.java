package com.ironsource.mediationsdk.logger;

import com.ironsource.C3270ib;
import com.ironsource.mediationsdk.logger.IronSourceLogger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public enum IronLog {
    API(IronSourceLogger.IronSourceTag.API),
    CALLBACK(IronSourceLogger.IronSourceTag.CALLBACK),
    ADAPTER_API(IronSourceLogger.IronSourceTag.ADAPTER_API),
    ADAPTER_CALLBACK(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK),
    NETWORK(IronSourceLogger.IronSourceTag.NETWORK),
    INTERNAL(IronSourceLogger.IronSourceTag.INTERNAL),
    NATIVE(IronSourceLogger.IronSourceTag.NATIVE),
    EVENT(IronSourceLogger.IronSourceTag.EVENT);


    /* renamed from: a, reason: collision with root package name */
    IronSourceLogger.IronSourceTag f37572a;

    IronLog(IronSourceLogger.IronSourceTag ironSourceTag) {
        this.f37572a = ironSourceTag;
    }

    public void error(String str, Throwable th2) {
        IronSourceLoggerManager.getLogger().a(this.f37572a, new C3270ib(str, 3), th2);
    }

    public void general(String str) {
        IronSourceLoggerManager.getLogger().a(this.f37572a, new C3270ib(str, 4));
    }

    public void info(String str) {
        IronSourceLoggerManager.getLogger().a(this.f37572a, new C3270ib(str, 1));
    }

    public void verbose(String str) {
        IronSourceLoggerManager.getLogger().a(this.f37572a, new C3270ib(str, 0));
    }

    public void warning(String str) {
        IronSourceLoggerManager.getLogger().a(this.f37572a, new C3270ib(str, 2));
    }

    public void error(String str) {
        IronSourceLoggerManager.getLogger().a(this.f37572a, new C3270ib(str, 3));
    }

    public void general() {
        IronSourceLoggerManager.getLogger().a(this.f37572a, new C3270ib("", 4));
    }

    public void info() {
        IronSourceLoggerManager.getLogger().a(this.f37572a, new C3270ib("", 1));
    }

    public void verbose() {
        IronSourceLoggerManager.getLogger().a(this.f37572a, new C3270ib("", 0));
    }

    public void warning() {
        IronSourceLoggerManager.getLogger().a(this.f37572a, new C3270ib("", 2));
    }

    public void error() {
        IronSourceLoggerManager.getLogger().a(this.f37572a, new C3270ib("", 3));
    }
}
