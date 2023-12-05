package com.pruebasblu;

import android.content.Context;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class BluetoothModule extends ReactContextBaseJavaModule {

    private VPOperateManager vpOperateManager;

    public BluetoothModule(ReactApplicationContext reactContext) {
        super(reactContext);
        Context androidContext = reactContext.getApplicationContext();
        vpOperateManager = VPOperateManager.getMangerInstance(androidContext);
    }

    @Override
    public String getName() {
        return "BluetoothModule";
    }

    // Método para iniciar el escaneo de dispositivos
    @ReactMethod
    public void startScanDevice() {
        vpOperateManager.startScanDevice();
    }

    // Método para conectar a un dispositivo
    @ReactMethod
    public void connectDevice() {
        vpOperateManager.connectDevice();
    }

    // Método para confirmar la contraseña del dispositivo
    @ReactMethod
    public void confirmDevicePwd() {
        vpOperateManager.confirmDevicePwd();
    }

    // Método para sincronizar la información personal
    @ReactMethod
    public void syncPersonInfo() {
        vpOperateManager.syncPersonInfo();
    }

    // Método para registrar el estado de conexión del dispositivo
    @ReactMethod
    public void registerConnectStatusListener() {
        vpOperateManager.registerConnectStatusListener();
    }

    // Método para registrar el estado de cambio de Bluetooth del sistema
    @ReactMethod
    public void registerBluetoothStateListener() {
        vpOperateManager.registerBluetoothStateListener();
    }

    // Otros métodos para operaciones adicionales de interacción de datos pueden agregarse de manera similar
}
