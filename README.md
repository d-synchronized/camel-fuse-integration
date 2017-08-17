camel-fuse-integration is a practice project which will deep dive into the FUSE / OSGI / Spring / Camel Integration

To run the project you would need to install basic software from Jboss Fuse Website.

1. Jboss Fuse Karaf installer
2. Jboss Developer Studio

After importing the project . Run mvn clean install on project. After this your jar will be installed in your .m2

Once done , Fire up your Fuse installation.On Command prompt you will get Karaf starting prompt

Type below command to install your bundle.
install mvn:com.threaddynamics/camel-fuse-integration/1.0.0-SNAPSHOT

This will get your bundle install inside Fuse runtime and will return you id for your installed bundle.

To start your bundle type

start [YOUR_BUNDLE_ID];


----------------------------------------------------------IN PROGRESS---------------------------------------------------------------------
