import React from 'react';
import { View, Button } from 'react-native';
import { NativeModules } from 'react-native';

const { BluetoothModule } = NativeModules;

const App = () => {
  const handleScanDevice = () => {
    BluetoothModule.startScanDevice();
  };

  const handleConnectDevice = () => {
    BluetoothModule.connectDevice();
  };

  const handleConfirmDevicePwd = () => {
    BluetoothModule.confirmDevicePwd();
  };

  const handleSyncPersonInfo = () => {
    BluetoothModule.syncPersonInfo();
  };

  const handleRegisterConnectStatusListener = () => {
    BluetoothModule.registerConnectStatusListener();
  };

  const handleRegisterBluetoothStateListener = () => {
    BluetoothModule.registerBluetoothStateListener();
  };

  return (
    <View>
      <Button title="Start Scan" onPress={handleScanDevice} />
      <Button title="Connect Device" onPress={handleConnectDevice} />
      <Button title="Confirm Device Password" onPress={handleConfirmDevicePwd} />
      <Button title="Sync Personal Info" onPress={handleSyncPersonInfo} />
      <Button title="Register Connect Status Listener" onPress={handleRegisterConnectStatusListener} />
      <Button title="Register Bluetooth State Listener" onPress={handleRegisterBluetoothStateListener} />
    </View>
  );
};

export default App;
