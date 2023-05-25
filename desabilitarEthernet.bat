@echo off
wmic path win32_networkadapter where NetConnectionID="Ethernet" call disable