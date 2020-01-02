import os
def execute_preReq():
	os.system("sudo cp ~/Desktop/Imtehaan/Imtehaan.desktop ~/.config/autostart/")
	os.system("sudo gsettings set org.compiz.unityshell:/org/compiz/profiles/unity/plugins/unityshell/ launcher-hide-mode 1")
	print("\nSetup Completed..!!\nRebooting OS..")
	os.system("shutdown -r now")

execute_preReq()
